sum = 0
with open("input.txt") as f:
    for line in f:
        biggestTens = int(line[0])
        tensIndex = 0
        for t in range(1, len(line) - 2):
            if int(line[t]) > biggestTens:
                biggestTens = int(line[t])
                tensIndex = t
            if biggestTens == 9:
                break
        biggestOnes = int(line[tensIndex + 1])
        for o in range (tensIndex + 1, len(line) - 1):
            if int(line[o]) > biggestOnes:
                biggestOnes = int(line[o])
            if biggestOnes == 9:
                break

        joltage = biggestTens * 10 + biggestOnes
        sum += joltage
    print(f'Sum: {sum}')

