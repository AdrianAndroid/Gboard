package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* renamed from: hck  reason: default package */
/* loaded from: classes.dex */
public final class hck {
    public final llp a;
    public final llp b;
    public final Optional c;
    public final boolean d;
    public final dxe e;

    public hck() {
    }

    public hck(llp llpVar, dxe dxeVar, llp llpVar2, Optional optional, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = llpVar;
        this.e = dxeVar;
        this.b = llpVar2;
        this.c = optional;
        this.d = z;
    }

    public static hcj a() {
        hcj hcjVar = new hcj(null);
        hcjVar.b(true);
        llp q = llp.q();
        if (q != null) {
            hcjVar.b = q;
            hcjVar.c = (byte) (hcjVar.c | 2);
            return hcjVar;
        }
        throw new NullPointerException("Null itemProviders");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hck) {
            hck hckVar = (hck) obj;
            llp llpVar = this.a;
            if (llpVar != null ? lre.I(llpVar, hckVar.a) : hckVar.a == null) {
                dxe dxeVar = this.e;
                if (dxeVar != null ? dxeVar.equals(hckVar.e) : hckVar.e == null) {
                    if (lre.I(this.b, hckVar.b) && this.c.equals(hckVar.c) && this.d == hckVar.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        boolean z = this.d;
        return "EmojiPickerDataOptions{recentEmojiProviders=" + valueOf + ", suggestionEmojiProvider=" + valueOf2 + ", itemProviders=" + valueOf3 + ", pageableItemProvider=" + valueOf4 + ", imageLoader=null, stickyVariantsEnabled=" + z + ", emojiVariantsController=null, emojiVariantsOptions=null, itemFetchingTimeoutMs=0}";
    }

    public final int hashCode() {
        llp llpVar = this.a;
        int i = 0;
        int hashCode = ((llpVar == null ? 0 : llpVar.hashCode()) ^ 1000003) * 1000003;
        dxe dxeVar = this.e;
        if (dxeVar != null) {
            i = dxeVar.hashCode();
        }
        return (((((((hashCode ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ (true != this.d ? 1237 : 1231)) * 583896283;
    }
}
