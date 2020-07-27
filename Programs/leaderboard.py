def climbingLeaderboard(scores, alices):
    r=[]
    l=list(set(scores))
    l.sort(reverse=True)
    for i in range(0,len(alices),1):
        for j in range(0,len(l),1):
            if(alices[i]==l[j]):
                r.append(j+1)
                break
            else:
                if(alices[i]>l[j]):
                    if(j==0):
                        r.append(j+1)
                        break
                    else:
                        r.append(j+1)
                        break
                else:
                    if(alices[i]<l[j] and j==len(l)-1):
                        r.append(j+2)
                        break     
    print('\n'.join(map(str,r)))
s = int(input('Enter n : '))
score = input('Enter Scores : ').split(',')
a = int(input('Enter a : '))
alice = input('Enter alice : ').split(',')
scores = [int(i) for i in score]
alices = [int(i) for i in alice]
climbingLeaderboard(scores,alices)
