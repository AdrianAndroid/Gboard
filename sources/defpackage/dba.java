package defpackage;

/* compiled from: PG */
/* renamed from: dba  reason: default package */
/* loaded from: classes.dex */
public final class dba {
    public static final dba a = new dba("", ldu.a);
    public final String b;
    private final lfb c;

    public dba() {
    }

    public dba(String str, lfb lfbVar) {
        this.b = "";
        this.c = lfbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dba) {
            dba dbaVar = (dba) obj;
            if (this.b.equals(dbaVar.b) && this.c.equals(dbaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        return "StickerActivationPayload{stickerPackId=" + str + ", stickerId=" + valueOf + "}";
    }
}
