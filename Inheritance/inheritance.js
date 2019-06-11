var a = {
    x: 10,
    calculate: function (z) {
    return this.x + this.y + z;
    }
    };
    var b = {
    y: 20,
    __proto__: a
    };
    var c = {
    y: 30,
    __proto__: a
    };
    // call the inherited method
    b.calculate(30); // 60
    c.calculate(40); // 80