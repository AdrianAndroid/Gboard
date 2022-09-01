package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bnd  reason: default package */
/* loaded from: classes.dex */
public final class bnd implements InvocationHandler {
    final /* synthetic */ Executor a;
    final /* synthetic */ Object b;
    final /* synthetic */ Class c;

    public bnd(Executor executor, Object obj, Class cls) {
        this.a = executor;
        this.b = obj;
        this.c = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        this.a.execute(new bnf(this.b, method, objArr, this.c));
        return null;
    }
}
