package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: axi  reason: default package */
/* loaded from: classes.dex */
final class axi implements awk, avi {
    private final awj a;
    private final awl b;
    private int c;
    private int d = -1;
    private auw e;
    private List f;
    private int g;
    private File h;
    private axj i;
    private volatile fws j;

    public axi(awl awlVar, awj awjVar) {
        this.b = awlVar;
        this.a = awjVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [avj, java.lang.Object] */
    @Override // defpackage.awk
    public final void a() {
        fws fwsVar = this.j;
        if (fwsVar != null) {
            fwsVar.a.fh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [avj, java.lang.Object] */
    @Override // defpackage.avi
    public final void b(Object obj) {
        this.a.e(this.e, obj, this.j.a, 4, this.i);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [avj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [avj, java.lang.Object] */
    @Override // defpackage.awk
    public final boolean c() {
        List list;
        List e = this.b.e();
        boolean z = false;
        if (e.isEmpty()) {
            return false;
        }
        awl awlVar = this.b;
        bmf b = awlVar.c.b();
        Class<?> cls = awlVar.d.getClass();
        Class cls2 = awlVar.g;
        Class cls3 = awlVar.j;
        Object obj = b.a;
        bgh bghVar = (bgh) ((AtomicReference) ((bek) obj).a).getAndSet(null);
        if (bghVar == null) {
            bghVar = new bgh(cls, cls2, cls3);
        } else {
            bghVar.a(cls, cls2, cls3);
        }
        synchronized (((bek) obj).b) {
            list = (List) ((qv) ((bek) obj).b).get(bghVar);
        }
        ((AtomicReference) ((bek) obj).a).set(bghVar);
        if (list == null) {
            list = new ArrayList();
            for (Class cls4 : ((azp) b.i).a(cls)) {
                for (Class cls5 : ((bek) b.j).b(cls4, cls2)) {
                    if (!((aqr) b.f).g(cls5, cls3).isEmpty() && !list.contains(cls5)) {
                        list.add(cls5);
                    }
                }
            }
            Object obj2 = b.a;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (((bek) obj2).b) {
                ((qv) ((bek) obj2).b).put(new bgh(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.b.j)) {
                return false;
            }
            String valueOf = String.valueOf(this.b.d.getClass());
            String valueOf2 = String.valueOf(this.b.j);
            throw new IllegalStateException("Failed to find any load path from " + valueOf + " to " + valueOf2);
        }
        while (true) {
            if (this.f != null && d()) {
                this.j = null;
                while (!z && d()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    File file = this.h;
                    awl awlVar2 = this.b;
                    this.j = ((azn) list2.get(i)).b(file, awlVar2.e, awlVar2.f, awlVar2.h);
                    if (this.j != null && this.b.h(this.j.a.a())) {
                        this.j.a.f(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= e.size()) {
                    return false;
                }
                this.d = 0;
            }
            auw auwVar = (auw) e.get(this.c);
            Class cls6 = (Class) list.get(this.d);
            ave a = this.b.a(cls6);
            axn c = this.b.c();
            awl awlVar3 = this.b;
            this.i = new axj(c, auwVar, awlVar3.m, awlVar3.e, awlVar3.f, a, cls6, awlVar3.h);
            File a2 = awlVar3.d().a(this.i);
            this.h = a2;
            if (a2 != null) {
                this.e = auwVar;
                this.f = this.b.g(a2);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [avj, java.lang.Object] */
    @Override // defpackage.avi
    public final void e(Exception exc) {
        this.a.d(this.i, exc, this.j.a, 4);
    }
}
