#include <stdio.h>
#include <string.h>
#define _CRT_SECURE_NO_WARNINGS

struct KNode {
	struct KNode *left;
	char key[10];
	int info;
	struct KNode *right;
};

int main() {
	
	struct KNODE kn; 
	
	void Inorder(kn *rootptr) {
		if(rootptr != NULL) {
			Inorder(rootptr -> left);
			printf("%d", rootptr -> info);
			Inorder(rootptr -> right);
		}
	}
	

	return 0;
}
