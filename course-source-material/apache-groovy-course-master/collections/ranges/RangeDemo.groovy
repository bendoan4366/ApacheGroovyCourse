
Range r = 1..10
//prints [1,2,3 .... 10]
println r
//prints groovy.lang.IntRange
println r.class.name
//1
println r.from
//10
println r.to

//passes
assert (0..10).contains(0)
//passes
assert (0..10).contains(10)
//raises assertion fail error
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

// 1->10 non-inclusive
//passes
assert (0..<10).contains(0)
//passes
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

println today
println oneWeekAway

Range days = today..oneWeekAway
//prints range of datetime objects from today -> 7 days from today
println days

Range letters = 'a'..'z'
//prints a -> z alphabetically
println letters