package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;

/* compiled from: PG */
/* renamed from: drq  reason: default package */
/* loaded from: classes.dex */
public final class drq {
    public hls a;
    public final ArrayDeque b = new ArrayDeque(3);
    public boolean c;
    public boolean d;

    public static boolean a(iay iayVar) {
        Object obj = iayVar.e;
        return (obj instanceof CharSequence) && !TextUtils.equals("\n", (CharSequence) obj);
    }
}
