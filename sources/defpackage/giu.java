package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: giu  reason: default package */
/* loaded from: classes.dex */
public final class giu {
    public final int a;
    public final int b;
    public final Map c;
    private final int d;
    private final gip e;
    private final int f;
    private final int g;

    public giu() {
    }

    public giu(int i, int i2, gip gipVar, int i3, int i4, int i5, Map map) {
        this.a = i;
        this.d = i2;
        this.e = gipVar;
        this.f = i3;
        this.g = i4;
        this.b = i5;
        this.c = map;
    }

    public static git a(int i, int i2) {
        git gitVar = new git();
        gitVar.a = i;
        byte b = gitVar.h;
        gitVar.b = i2;
        int i3 = b | 3;
        gitVar.h = (byte) i3;
        gitVar.c = new gip();
        gitVar.d = 392;
        gitVar.e = 392;
        gitVar.f = 4;
        gitVar.h = (byte) (i3 | 60);
        gitVar.g = new HashMap();
        return gitVar;
    }

    public static git b(njs njsVar, njr njrVar) {
        return a(njsVar.a, njrVar.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof giu) {
            giu giuVar = (giu) obj;
            if (this.a == giuVar.a && this.d == giuVar.d && this.e.equals(giuVar.e) && this.f == giuVar.f && this.g == giuVar.g && this.b == giuVar.b && this.c.equals(giuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.d) * (-721379959)) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.b) * (-721379959)) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.d;
        String valueOf = String.valueOf(this.e);
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.b;
        String valueOf2 = String.valueOf(this.c);
        return "AvatarSticker{styleId=" + i + ", stickerId=" + i2 + ", avatarHashCode=" + valueOf + ", width=" + i3 + ", height=" + i4 + ", padding=" + i5 + ", backgroundColor=0, customizationMap=" + valueOf2 + "}";
    }
}
