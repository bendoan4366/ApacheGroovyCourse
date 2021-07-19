List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums

//java.util.ArrayList 
println nums.class.name

// add | remove | get | clear

//add 99
nums.push(99)
// 77 at 0 index
nums.putAt(0,77)
// 78 at 0 index
nums[0] = 78
//creates new list object, needs to be assigned to new variable
nums + 7
nums << 66

//remove last element
nums.pop()
//remove first list item
nums.removeAt(0)
//remove all instances of 3 from list
def newList = nums - 3
println newList

println nums.getAt(0..3)
nums = []

// flatten
nums << [3,4,5]
nums << [1,2]
println nums
println nums.flatten()

// equals
def myNumbers = [1,2,3]
def myNumbers2 = [1,2,3]
println myNumbers.equals(myNumbers2)

// findAll
println nums.findAll { it == 4 }
println nums.flatten().findAll { it < 5 }

// getAt(Range)
println nums.getAt(0..5)

// reverse list
println nums.reverse()

// unique
println nums.unique()

// Java Collections List(LinkedList) (Set,SortedSet)
def evens = [10,2,8,4,24,14,2] as Set
println evens
println evens.class.name

