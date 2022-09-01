package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: dbs  reason: default package */
/* loaded from: classes.dex */
public final class dbs {
    private static final lug b = hin.a;
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/extension/KeyboardGroupDefParser");
    public ibw a;
    private volatile long d;
    private final Context e;
    private final int f;

    public dbs(Context context, int i) {
        this.e = context;
        this.f = i;
    }

    public final ibw a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.d;
        try {
            jfy.d(this.e, this.f, new hue(this, 1));
        } catch (IOException | XmlPullParserException e) {
            ((luc) ((luc) b.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/extension/KeyboardGroupDefParser", "parseKeyboardGroupDef", 82, "KeyboardGroupDefParser.java")).s();
        }
        ((ltd) ((ltd) c.b()).k("com/google/android/apps/inputmethod/libs/extension/KeyboardGroupDefParser", "parseKeyboardGroupDef", 87, "KeyboardGroupDefParser.java")).K("parseKeyboardGroupDef() %d -> %s : WaitTime = %d ms : RunTime = %d ms", Integer.valueOf(this.f), this.e.getResources().getResourceEntryName(this.f), Long.valueOf(j), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        return this.a;
    }

    public final mko b() {
        this.d = SystemClock.uptimeMillis();
        return gxo.a(5).hQ(new aty(this, 3));
    }
}
