## Tasking 

### 停车
--- 
Given Parkinglot、Car 
When park 
Then return Token

---
Given Full ParkingLot 、Car
When park
Then return SpaceFullException

### 取车
--- 
Given Token、Parkinglot
When pick
Then return a car

---
Given Invalid Token 
When pick
Then return CarNotExistException
