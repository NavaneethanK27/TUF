class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        version1 = version1.split('.')
        version2 = version2.split('.')
        if(len(version1)<len(version2)):
            version1.extend([0]*(len(version2)-len(version1)))
        else:
            version2.extend([0]*(len(version1)-len(version2)))
        i = 0
        j = 0
        while(i<len(version1) and j<len(version2)):
            if((int(version1[i]) == 0 and int(version2[j])!= 0 ) or
                int(version1[i]) < int(version2[j])
            ):
                return -1
            elif((int(version1[i])!=0 and int(version2[j]) == 0) 
                or int(version1[i]) > int(version2[j])
             ):
                return 1
            else:
                i+=1
                j+=1
        return 0