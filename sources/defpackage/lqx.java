package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lqx  reason: default package */
/* loaded from: classes.dex */
public interface lqx extends Collection {
    int a(Object obj);

    int d(Object obj, int i);

    Set e();

    Set f();

    void g();

    void h(Object obj);

    boolean i(Object obj, int i);

    @Override // java.util.Collection, java.lang.Iterable, defpackage.lqx
    Iterator iterator();

    @Override // java.util.Collection, defpackage.lqx
    int size();
}
