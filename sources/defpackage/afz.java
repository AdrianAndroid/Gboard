package defpackage;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import com.google.android.libraries.animation.impl.AnimationControllerFactoryImpl$ValueAnimatorTicker$1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: afz  reason: default package */
/* loaded from: classes.dex */
public final class afz {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aft a(Object obj) {
        boolean z = obj instanceof aft;
        boolean z2 = obj instanceof AnimationControllerFactoryImpl$ValueAnimatorTicker$1;
        if (z && z2) {
            AnimationControllerFactoryImpl$ValueAnimatorTicker$1 animationControllerFactoryImpl$ValueAnimatorTicker$1 = (AnimationControllerFactoryImpl$ValueAnimatorTicker$1) obj;
            return new FullLifecycleObserverAdapter((aft) obj);
        } else if (z2) {
            AnimationControllerFactoryImpl$ValueAnimatorTicker$1 animationControllerFactoryImpl$ValueAnimatorTicker$12 = (AnimationControllerFactoryImpl$ValueAnimatorTicker$1) obj;
            return new FullLifecycleObserverAdapter(null);
        } else if (z) {
            return (aft) obj;
        } else {
            Class<?> cls = obj.getClass();
            if (b(cls) == 2) {
                List list = (List) b.get(cls);
                if (list.size() == 1) {
                    return new SingleGeneratedAdapterObserver(c((Constructor) list.get(0), obj));
                }
                afn[] afnVarArr = new afn[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    afnVarArr[i] = c((Constructor) list.get(i), obj);
                }
                return new CompositeGeneratedAdaptersObserver(afnVarArr);
            }
            return new ReflectiveGenericLifecycleObserver(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r5.booleanValue() != false) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int b(java.lang.Class r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afz.b(java.lang.Class):int");
    }

    private static afn c(Constructor constructor, Object obj) {
        try {
            return (afn) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static boolean d(Class cls) {
        return cls != null && afu.class.isAssignableFrom(cls);
    }
}
