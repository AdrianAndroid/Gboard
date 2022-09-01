package defpackage;

import android.content.Context;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: bqo  reason: default package */
/* loaded from: classes.dex */
public final class bqo {
    public final String a;
    public final int b;
    public final int c;
    private final int d;

    public bqo(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a(Context context) {
        return context.getResources().getInteger(this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqo)) {
            return false;
        }
        bqo bqoVar = (bqo) obj;
        return this.a.equals(bqoVar.a) && this.b == bqoVar.b && this.d == bqoVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.d)});
    }
}
