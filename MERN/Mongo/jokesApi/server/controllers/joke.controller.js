const Joke = require("../models/joke.model");

module.exports = {

    findRandomJoke: (req, res) => {
        Joke.find({})
        .then(
            //allJokes has count cuz array
            //return allJokes[random]
        )
        .catch()
    },

    testResponse: (req, res) =>{
        res.json({message: "test message!"})
    },

    findAll: (req,res) => {
        Joke.find({})
            .then(results => res.json(results))
            .catch(err => res.status(400).json({message: "no worky", err}))
    },

    findOne: (req,res) => {
        Joke.findOne({_id: req.params._id})
            .then(results => res.json(results))
            .catch(err => res.status(400).json({message: "no worky", err}))
    },

    createJoke: (req,res) =>{
        Joke.create(req.body)
            .then(results => res.json(results))
            .catch(err => res.status(400).json({message: "no worky", err}))
    },

    deleteOne: (req,res) => {
        Joke.deleteOne({_id: req.params._id})
            .then(results => res.json(results))
            .catch(err => res.status(400).json({message: "no worky", err}))
    },

    updateOne: (req,res) =>{
        Joke.updateOne({_id: req.params._id}, req.body)
            .then(results => res.json(results))
            .catch(err => res.status(400).json({message: "no worky", err}))
    },
}