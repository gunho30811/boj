def solve_linear_equations(a, b, c, d, e, f):
    # Calculate the determinant of the coefficient matrix
    determinant = a * e - b * d
    
    # Using Cramer's rule to find x and y
    x = (c * e - b * f) / determinant
    y = (a * f - c * d) / determinant
    
    return int(x), int(y)

# Input
a, b, c, d, e, f = map(int, input().split())

# Solve the system of equations
solution = solve_linear_equations(a, b, c, d, e, f)
print(solution[0], solution[1])
