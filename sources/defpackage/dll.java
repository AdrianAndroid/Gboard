package defpackage;

import android.util.Printer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dll  reason: default package */
/* loaded from: classes.dex */
final class dll implements gzv {
    public static final dll a = new dll();
    public final Map b = new ConcurrentHashMap();

    private dll() {
        gzt.a.a(this);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("  Hashed preview cache file names and their original ones:");
        ArrayList B = lre.B(this.b.entrySet());
        int size = B.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) B.get(i);
            printer.println("  " + ((String) entry.getKey()) + " = " + ((String) entry.getValue()));
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "KeyboardPreviewCacheDumper";
    }
}
