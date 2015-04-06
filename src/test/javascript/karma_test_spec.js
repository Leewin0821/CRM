describe("test", function() {
	it("should return 'abc'", function(){
		expect(test()).toEqual('abc');
	});
});

describe("plus", function() {
	it("add two numbers together", function(){
		expect(plus(1,2)).toBe(3);
	});
	
	it("get wrong message for not equal", function(){
		expect(plus(2,3)).not.toEqual(9);
	})
});