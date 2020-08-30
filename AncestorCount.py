
# Laskee summittaisen laskennallisen arvion esipolvien syntymavuodesta
# ja tarkan maaran ihmisten lukumaarasta esipolvissa.
# 
# author Ilpo Kantonen 6.1.2016 ported to python 30.8.2020
#

ANCESTORS = 16
AVEMOTHAGE = 30
omaSyntymaVuosi = 1962

print('Sukupolvi\tSyntymavuosi\tIhmisia')

for i in range(0, ANCESTORS):    
    print('%d\t\t%d\t\t%d' %(i,(omaSyntymaVuosi - AVEMOTHAGE),pow(2,(i+1))-1))
