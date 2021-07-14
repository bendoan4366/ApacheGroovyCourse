

def text = "Real real can I lay with ya'll. Ay Ay!"
def pattern = ~/.*I lay with ya'll.*/

def finder = text =~ pattern
def matcher = text ==~ pattern

println finder[0]
println matcher