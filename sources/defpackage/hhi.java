package defpackage;

import android.util.Pair;
import android.util.StringBuilderPrinter;
import java.util.List;

/* compiled from: PG */
/* renamed from: hhi  reason: default package */
/* loaded from: classes.dex */
final class hhi extends hhf {
    @Override // defpackage.hhf
    public final void d(List list, boolean z) {
        hsk b = hsx.b();
        StringBuilder sb = new StringBuilder();
        StringBuilderPrinter stringBuilderPrinter = new StringBuilderPrinter(sb);
        if (b != null) {
            b.au(stringBuilderPrinter, z);
            list.add(Pair.create("gims-dump", sb.toString()));
        } else {
            gzt.a.dump(stringBuilderPrinter, z);
            list.add(Pair.create("dumpable-object-dump", sb.toString()));
        }
        list.add(Pair.create("device-mode", irn.d()));
    }
}
