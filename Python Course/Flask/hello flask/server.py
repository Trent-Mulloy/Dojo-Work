from flask import Flask, render_template  # added render_template!
app = Flask(__name__)                     
    

@app.route('/')
def index():
    return render_template("index.html", phrase="hello", times=5)	# notice the 2 new named arguments!





























if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode.

