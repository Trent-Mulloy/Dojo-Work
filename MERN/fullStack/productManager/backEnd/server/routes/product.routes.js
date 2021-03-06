const ProductController = require("../controllers/product.controller");

module.exports = app =>{
    app.get("/api/test", ProductController.testResponse);

    app.get("/api/products", ProductController.findAll);

    app.get("/api/product/:_id", ProductController.findOne);

    app.post("/api/product/new", ProductController.createProduct);

    app.delete("/api/product/delete/:_id", ProductController.deleteOne);

    app.patch("/api/update/product/:_id", ProductController.updateOne)
}