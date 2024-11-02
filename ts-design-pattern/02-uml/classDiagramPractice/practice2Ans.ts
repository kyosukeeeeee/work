interface Shape {
    clacArea():number
}

class Rectangle implements shape {
    private width:number
    private height: number

    clacArea():number {
        return this.width * this.height
    }
}

class Circle implements shape {
    private redius:number

    clacArea():number {
        return this.redius * this.redius * Math.PI
    }
}

class Client {
    private shape: Shape
}