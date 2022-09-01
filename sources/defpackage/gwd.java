package defpackage;

/* compiled from: PG */
/* renamed from: gwd  reason: default package */
/* loaded from: classes.dex */
public final class gwd {
    public String a;
    public mhf b;
    private String c;
    private long d;
    private long e;
    private boolean f;
    private llp g;
    private byte h;

    public final gwe a() {
        String str;
        String str2;
        llp llpVar;
        mhf mhfVar;
        if (this.h != 7 || (str = this.c) == null || (str2 = this.a) == null || (llpVar = this.g) == null || (mhfVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" issueTitle");
            }
            if ((this.h & 1) == 0) {
                sb.append(" componentId");
            }
            if ((this.h & 2) == 0) {
                sb.append(" happenedTime");
            }
            if (this.a == null) {
                sb.append(" bugAssignee");
            }
            if ((this.h & 4) == 0) {
                sb.append(" requireBugReport");
            }
            if (this.g == null) {
                sb.append(" clipDatas");
            }
            if (this.b == null) {
                sb.append(" hotListIds");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gwe(str, this.d, this.e, str2, this.f, llpVar, mhfVar);
    }

    public final void b(llp llpVar) {
        if (llpVar != null) {
            this.g = llpVar;
            return;
        }
        throw new NullPointerException("Null clipDatas");
    }

    public final void c(long j) {
        this.d = j;
        this.h = (byte) (this.h | 1);
    }

    public final void d(long j) {
        this.e = j;
        this.h = (byte) (this.h | 2);
    }

    public final void e(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null issueTitle");
    }

    public final void f(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 4);
    }
}
