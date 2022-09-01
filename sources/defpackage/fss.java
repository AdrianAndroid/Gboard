package defpackage;

/* compiled from: PG */
/* renamed from: fss  reason: default package */
/* loaded from: classes.dex */
public class fss {
    final String d;
    public final fth f;
    boolean g = false;
    public final fsl e = new fsl();

    public fss(String str) {
        fti ftiVar;
        int i = 0;
        this.d = str;
        if (npx.c()) {
            String[] split = npx.a.a().a().split(",");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    ftiVar = fti.COARSE;
                    break;
                } else if (str.equals(split[i])) {
                    ftiVar = fti.FINE;
                    break;
                } else {
                    i++;
                }
            }
            this.f = new ftj(ftiVar);
            return;
        }
        this.f = new ftg();
    }

    protected void a(fsk fskVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(fsk fskVar) {
        synchronized (this) {
            if (this.g) {
                fskVar.b();
                return;
            }
            this.g = true;
            try {
                a(fskVar);
            } catch (Exception unused) {
            }
        }
    }
}
