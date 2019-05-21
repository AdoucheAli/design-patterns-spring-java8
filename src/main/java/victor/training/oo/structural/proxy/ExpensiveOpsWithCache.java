//package victor.training.oo.structural.proxy;
//
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.util.HashMap;
//import java.util.Map;
//
////@Service
////@Primary
////@Profile("!local")
////-Dspring.profiles.active=local
//public class ExpensiveOpsWithCache implements IExpensiveOps {
//    private Map<Integer, Boolean> cache = new HashMap<>();
//    private final IExpensiveOps ops;
//
//    public ExpensiveOpsWithCache(IExpensiveOps ops) {
//        this.ops = ops;
//    }
//
//    public Boolean isPrime(int n) {
////        if (cache.containsKey(n)) {
////            return cache.get(n);
////        }
////        Boolean result = ops.isPrime(n);
////        cache.put(n, result);
////        return result;
//
//        return cache.computeIfAbsent(n, nn -> ops.isPrime(n));
//    }
//
//    @Override
//    public String hashAllFiles(File folder) {
//        return ops.hashAllFiles(folder);
//    }
//}