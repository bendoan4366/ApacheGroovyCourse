// Java Sample Pattern

import java.util.regex.*;
Pattern pattern = Pattern.compile("a\\\\b")
println pattern
println pattern.class

// What patterns will look like in Groovy

String slashy = /a\b/
String url = $/http://threaldanvega.com/blog/$
//returns string
println slashy.class

def pattern = ~/a\b/
//returns java.util.regex.Pattern
println pattern.class


// Find | Match
def text = "Being a Cleveland Sports Fan is no way to go through life" // true

//define java.util.regex.Pattern
def pattern = ~/Cleveland Sports Fan/

//returns a regex matcher object with list of matches
def finder = text =~ pattern
//returns java.util.regex.Matcher[pattern=Cleveland Sports Fan region=0,57 lastmatch=]
println finder
//returns 1
println finder.size()

//returns false
def matcher = text ==~ pattern

println matcher

// ----------------------------------------------------------------------------------

def text = "Cleveland Sports Fan"
def pattern = ~/Cleveland Sports Fan/

//returns true
def matcher = text ==~ pattern

println matcher

if( matcher ) { // do something }


// ----------------------------------------------------------------------------------

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern = ~/Cleveland/

text = text.replaceFirst(pattern,"Buffalo")
println text
