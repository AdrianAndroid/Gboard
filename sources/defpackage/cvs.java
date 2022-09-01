package defpackage;

import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: cvs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cvs implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cvs(cvx cvxVar, int i, Locale locale, int i2) {
        this.d = i2;
        this.b = cvxVar;
        this.a = i;
        this.c = locale;
    }

    public /* synthetic */ cvs(kcq kcqVar, String str, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = i2;
        this.b = kcqVar;
        this.c = str;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.d != 0) {
            Object obj = this.b;
            return ((kcq) obj).D((String) this.c, this.a);
        }
        Object obj2 = this.b;
        int i = this.a;
        Object obj3 = this.c;
        if (i == 2) {
            cvx cvxVar = (cvx) obj2;
            Locale locale = (Locale) obj3;
            irh m = cvxVar.d.m(cvo.c(locale));
            try {
                if (!m.moveToNext()) {
                    throw new irb("Failed to move to first position");
                }
                String c = m.c(m.getColumnIndexOrThrow("id"));
                String c2 = m.c(m.getColumnIndexOrThrow("name"));
                m.close();
                lfb f = cvxVar.f(c, c2, locale);
                if (f.e()) {
                    return llp.r((cxc) f.a());
                }
                throw new cwy("Failed to get first pack");
            } catch (Throwable th) {
                try {
                    m.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        return ((cvx) obj2).g((Locale) obj3);
    }
}
