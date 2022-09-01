package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: agm  reason: default package */
/* loaded from: classes.dex */
public class agm {
    public final Map h = new HashMap();
    public final Set i = new LinkedHashSet();
    public volatile boolean j = false;

    public static void f(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void c() {
    }
}
