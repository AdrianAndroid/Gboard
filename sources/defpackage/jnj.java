package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* renamed from: jnj  reason: default package */
/* loaded from: classes.dex */
public final class jnj {
    public final PowerManager a;
    public final fwo b;
    public final int c;

    public jnj(Context context, fwo fwoVar, int i) {
        this.a = (PowerManager) context.getSystemService("power");
        this.b = fwoVar;
        this.c = i;
    }
}
