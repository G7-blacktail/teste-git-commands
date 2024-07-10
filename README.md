# Este repositório será para testar comandos git

## Priemiro vou criar uma branch main colocar uma porção de código

## Segundo irei criar outra branch que será exatamente a cópia da main

## Terceiro irei modificar ambas de forma diferente

## Depois vou testar comandos de merge da branch main para a nova procurando não perder o código da nova e sim mesclar corretamente a main

## Por último irei mescar a nova a main de forma que todas as mudanças sejam refletidas corretamente

Basicamente estou testando esta teoria:

  
O comportamento do merge no Git pode ser um pouco diferente dependendo da situação. Vou explicar as duas situações mais comuns:

Fast-forward merge:

Se a branch que você está tentando mesclar (feature_branch, por exemplo) contiver commits que ainda não estão presentes na branch na qual você está mesclando (por exemplo, master), o Git pode realizar um "fast-forward merge". Nesse caso, o Git simplesmente move a referência da branch alvo para apontar para o commit mais recente da branch que está sendo mesclada.
Merge padrão (merge de três vias):

Se houver alterações tanto na branch de origem quanto na branch de destino, o Git realizará um merge de três vias. Nesse caso, o Git cria um novo commit de merge que possui dois pais: um para o último commit da branch de origem e outro para o último commit da branch de destino.
Durante esse processo, o Git tentará automaticamente mesclar as alterações. Se houver conflitos, você precisará resolvê-los manualmente.
Em ambas as situações, o código resultante no commit de merge refletirá as alterações de ambas as branches. Se não houver conflitos, a mesclagem ocorre automaticamente e o código resultante contém todas as alterações.

Se houver conflitos, o Git indicará os conflitos e você precisará resolvê-los manualmente antes de finalizar o merge. Após resolver os conflitos, você faz um commit de merge para finalizar o processo.

Em resumo, o merge combina as alterações de ambas as branches, seja através de um fast-forward ou de um merge de três vias. O código resultante contém todas as alterações das branches envolvidas no merge.

Para realizar o merge da branch inclusao_frete com a branch master e atualizar o repositório remoto, você pode seguir os passos abaixo:

1. Mude para a branch master:
bash
Copiar código
git checkout master
2. Faça o merge da branch inclusao_frete:
bash
Copiar código
git merge inclusao_frete
Se houver conflitos, o Git indicará. Nesse caso, você precisará resolver os conflitos antes de continuar. Após resolver os conflitos, prossiga com o próximo passo.

3. Atualize o repositório remoto:
bash
Copiar código
git push origin master
Este comando enviará as alterações feitas no merge para o repositório remoto.

Nota:
Se você encontrar conflitos durante o merge, o Git indicará os arquivos com conflitos. Você precisará resolvê-los manualmente e, em seguida, continuar o processo de merge com git add e git merge --continue.

Certifique-se de que a branch master no repositório remoto está atualizada antes de fazer o push. Se alguém mais fez alterações na branch master remotamente, você pode precisar realizar um git pull antes de fazer o push.

Esses passos garantirão que a branch master local seja mesclada com a branch inclusao_frete e que as alterações sejam atualizadas no repositório remoto.
