import React, {useEffect, useState } from  'react';
import axios from 'axios';
import {useHistory} from 'react-router-dom';
import { useParams } from "react-router";

const EditProduct = (props) =>{
    const { _id } = useParams();
    const [form, setForm] = useState({
        title: "",
        description: "",
        price: null,
    });
    const history = useHistory();

    const [error, setError] = useState({});

    useEffect(()=>{
        axios.get(`http://localhost:8000/api/product/${_id}`)
            .then(res =>{
                setForm(res.data);
            })
            .catch(err => console.log(err));
    },[_id])

    const onChangeHandler = (e) =>{
        setForm({
            ...form,
            [e.target.name]: e.target.value
        })
    }
    const onSubmitHandler = (e) =>{
        e.preventDefault();
        axios.patch(`http://localhost:8000/api/update/product/${_id}`, form)
            .then(res =>{
                console.log(res);
                history.push('/')
            })
            .catch(err =>{
                console.log(err.response.data.err.errors);
                setError(err.response.data.err.errors);
            })
    }
    return(
        <div className='w-30 mx-auto my-4'>
            <h2>Fill Out The Form To Update A Product!</h2>
            <form className='w-25 mx-auto mt-4' onSubmit={onSubmitHandler}>
                <div className='form-group' >
                    <label htmlFor='Title'><h2>Product Name:</h2></label>
                    <input type='text' name='title' className='form-control' value={form.title} onChange={onChangeHandler}/>
                    <h5 className='text-danger bg-dark'>{error.title && error.title.message}</h5>
                </div>
                <div className='form-group'>
                    <label htmlFor='Description'><h2>Description:</h2></label>
                    <input type='text' name='description' className='form-control' value={form.description} onChange={onChangeHandler}/>
                    <h5 className='text-danger bg-dark'>{error.description && error.description.message}</h5>
                </div>
                <div className='form-group'>
                    <label htmlFor='Price'><h2>Price:</h2></label>
                    <input type='number' name='price' className='form-control' value={form.price} onChange={onChangeHandler}/>
                    <h5 className='text-danger bg-dark'>{error.price && error.price.message}</h5>
                </div>
                <input type='submit' value='Update Product' className=' btn btn-dark my-4'></input>
            </form>
        </div>
    )
    }

    export default EditProduct;