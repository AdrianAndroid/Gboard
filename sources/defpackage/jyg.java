package defpackage;

import android.database.sqlite.SQLiteException;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jyg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jyg implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jyg(jqx jqxVar, List list, String str, boolean z, int i) {
        this.e = i;
        this.d = jqxVar;
        this.b = list;
        this.c = str;
        this.a = z;
    }

    public /* synthetic */ jyg(jyh jyhVar, boolean z, jsz jszVar, Object obj, int i) {
        this.e = i;
        this.c = jyhVar;
        this.a = z;
        this.d = jszVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.e != 0) {
            Object obj = this.d;
            ?? r2 = this.b;
            Object obj2 = this.c;
            boolean z = this.a;
            try {
                jro.b(r2, "Cancellation request for pack '%s' failed", obj2);
                boolean z2 = false;
                for (mko mkoVar : r2) {
                    z2 |= ((Boolean) kcu.S(mkoVar)).booleanValue();
                }
                if (z2) {
                    ((jqx) obj).n.a(new jpg((String) obj2, 6));
                }
                if (z) {
                    try {
                        ((jqx) obj).i((String) obj2);
                        ((jqx) obj).k.c((String) obj2, Collections.emptySet(), 0);
                        ((jqx) obj).i.c((String) obj2);
                        ((jph) ((jqx) obj).k).a.b((String) obj2);
                        jvr jvrVar = ((jqx) obj).f;
                        jxz jxzVar = jxz.RELEASE_SUPERPACK;
                        lug lugVar = jsh.a;
                        File i = jvrVar.i((String) obj2);
                        if (i.exists()) {
                            jru jruVar = jvrVar.g;
                            for (File file : jru.e(i)) {
                                jvrVar.r(jsr.d((String) obj2, file.getName()), jxzVar, true);
                            }
                            juq juqVar = jvrVar.e;
                            try {
                                ((jvg) juqVar).b.getWritableDatabase().delete("file_metadata", "namespace=?", new String[]{(String) obj2});
                                jvrVar.g.b((String) obj2, i, jxzVar);
                            } catch (SQLiteException e) {
                                jum jumVar = ((jvg) juqVar).b;
                                IOException iOException = new IOException("SqliteFileMetadataTable#removeNamespace, SQL delete failed, namespace: ".concat(String.valueOf(obj2)), e);
                                jumVar.a(iOException);
                                throw iOException;
                            }
                        }
                        ((jqx) obj).n.a(new jpg((String) obj2, 7));
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        jqx jqxVar = (jqx) obj;
                        String str = (String) obj2;
                        jqxVar.n.a(new jpi(str, th, 3));
                        if (z) {
                            jqxVar.n.a(new jpi(str, th, 4));
                        }
                        throw th;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Object obj3 = this.c;
            boolean z3 = this.a;
            Object obj4 = this.d;
            Object obj5 = this.b;
            if (!z3) {
                ((jyh) obj3).b((jsz) obj4, obj5);
            }
            return kcu.K(null);
        }
    }
}
