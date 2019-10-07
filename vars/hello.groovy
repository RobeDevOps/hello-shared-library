def call(Map parameters){
    def name = parameters.name
    if(name){
        echo "hello: ${name}"
    }else{
        echo "hello world"
    }
}