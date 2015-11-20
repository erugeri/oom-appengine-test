# oom-appengine-test
deploy + call appspot url
when free heap is near 0 -> 502 Bad Gateway - nginx

then in syslog:

```
[  257.820460] Memory cgroup stats for /docker-daemon/docker/5a52738c0d660f108c46f64d906c1921a1513957b742d66ba0fc3ca86557896b: cache:92KB rss:3472KB rss_huge:0KB mapped_file:4KB writeback:0KB inactive_anon:8KB active_anon:3524KB inactive_file:28KB active_file:4KB unevictable:0KB
[  257.849288] Memory cgroup stats for /docker-daemon/docker/4e4465a725b80e458bbc5f410a06ee7767907f45000cfa76a12920eb39c57458: cache:216KB rss:42904KB rss_huge:0KB mapped_file:4KB writeback:0KB inactive_anon:28KB active_anon:42964KB inactive_file:124KB active_file:4KB unevictable:0KB
[  257.875948] [ pid ]   uid  tgid total_vm      rss nr_ptes swapents oom_score_adj name
[  257.884002] [ 2238]     0  2238   192897     8781      59        0          -900 docker
[  257.892122] [ 3143]     0  3143     9877      200      14        0             0 memcachep
[  257.900491] [ 3211]     0  3211     5017       75      16        0             0 jetty_run.sh
[  257.909120] [ 3290]     0  3290    35531     6151      29        0          -900 exe
[  257.917090] [ 3300]     0  3300     5014       65      15        0             0 start_nginx.sh
[  257.925894] [ 3303]     0  3303   963738   650264    1490        0             0 java
[  257.933836] [ 3321]     0  3321    22796      328      45        0             0 nginx
[  257.941870] [ 3325] 65534  3325    23249      758      45        0             0 nginx
[  257.949919] [ 3327]     0  3327    12965     2462      29        0             0 gunicorn
[  257.958206] [ 3399]     0  3399    60190     8983      52        0             0 gunicorn
[  257.966607] Memory cgroup out of memory: Kill process 3303 (java) score 979 or sacrifice child
[  257.975329] Killed process 3303 (java) total-vm:3854952kB, anon-rss:2601056kB, file-rss:0kB
[  258.288963] docker0: port 3(veth256dc82) entered disabled state
[  258.320630] docker0: port 3(veth256dc82) entered forwarding state
```