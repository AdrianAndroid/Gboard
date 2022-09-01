package defpackage;

import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cfy  reason: default package */
/* loaded from: classes.dex */
public final class cfy implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public cfy(Context context, jav javVar, int i) {
        this.a = i;
        this.b = context;
        this.c = javVar;
    }

    public cfy(cdh cdhVar, Context context, int i) {
        this.a = i;
        this.b = context;
        this.c = cdhVar;
    }

    public cfy(cge cgeVar, View view, int i) {
        this.a = i;
        this.c = cgeVar;
        this.b = view;
    }

    public cfy(nsn nsnVar, Throwable th, int i) {
        this.a = i;
        this.b = nsnVar;
        this.c = th;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cge, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            this.c.b((View) this.b);
        } else if (i == 1) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            for (String str : eju.p((Context) this.b)) {
                eju.q(arrayList, str, 2, true, seconds);
            }
            ((cdh) this.c).e(arrayList);
        } else if (i == 2) {
            Object obj = this.b;
            Object obj2 = this.c;
            ikh ikhVar = new ikh();
            try {
                ikf d = ikhVar.d((jav) obj2);
                ijy a = ijz.a((Context) obj, (jav) obj2);
                try {
                    File b = ikk.b((Context) obj, d, a);
                    if (a != null) {
                        a.close();
                    }
                    d.close();
                    ikhVar.close();
                    if (b == null) {
                        return;
                    }
                    ijl.b().g(new ila(b));
                } catch (Throwable th) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    ikhVar.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } else {
            ((nsn) this.b).j((Throwable) this.c);
        }
    }
}
