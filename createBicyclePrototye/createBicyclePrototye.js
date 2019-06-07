"use strict"
var bikeCreationModule=(function(){
     var createBicyclePrototye =function(){
     	return {
     		speed :0,
     		applyBreake: function(para){
     			this.speed=this.speed-para;
    		}
    		speedUp:function(para){
    			this.speed=this.speed+para;
    		}
     	}
     }
     var createMountainBikePrototype=function(parameter){
     	var toReturn =new Object.create(parameter);
     	toReturn.gear=1;
     	toReturn.setGear=function(gearValue){
     		this.gear=gearValue;
     	}
     	return toReturn;
     }
     var start =function(){
     	var createBicyclePrototye=createBicyclePrototye();
     	var MountainBikePrototype=createMountainBikePrototype(createBicyclePrototye);
     	BicyclePrototype.speedUp(2);
     }
     return{
     	startProcess:start,
     	createMountainBike:createMountainBikePrototype,
     	createBicycle:createBicyclePrototye

     }
})();
var x=bikeCreationModule;
x.startProcess();