def fatorial(n, show=False):
    f = 1
    for c in range (n,0,-1):
        if show:
            print(c, end='')
            if c > 1:
                print(' x ', end='')
            else:
                print(' = ', end='')
        f *= c
    return f


num = int(input('Digite um número para fatoriar: '))
print(fatorial(num, show=True))

# atividade realizada no dia 13 de julho de 2023