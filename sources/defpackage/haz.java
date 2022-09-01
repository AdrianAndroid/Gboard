package defpackage;

/* compiled from: PG */
/* renamed from: haz  reason: default package */
/* loaded from: classes.dex */
public final class haz {
    private boolean a;
    private byte b;

    public final hba a() {
        if (this.b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" stickyPreferencesEnabled");
            }
            if ((this.b & 2) == 0) {
                sb.append(" globalPreferencesEnabled");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new hba(this.a);
    }

    public final void b() {
        this.b = (byte) (this.b | 2);
    }

    public final void c() {
        this.a = true;
        this.b = (byte) (1 | this.b);
    }

    public final evg d() {
        if (this.b == 1) {
            return new evg(this.a);
        }
        throw new IllegalStateException("Missing required properties: shouldUseDebugConfig");
    }

    public final void e(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
