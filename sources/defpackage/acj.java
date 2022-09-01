package defpackage;

import android.widget.ListView;

/* compiled from: PG */
/* renamed from: acj  reason: default package */
/* loaded from: classes.dex */
public final class acj {
    public static void a(ListView listView, int i) {
        listView.scrollListBy(i);
    }

    static boolean b(ListView listView, int i) {
        return listView.canScrollList(i);
    }
}
