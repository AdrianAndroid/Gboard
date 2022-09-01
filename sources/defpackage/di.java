package defpackage;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.LocaleList;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: di  reason: default package */
/* loaded from: classes.dex */
public class di {
    public static void c(wu wuVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(wuVar.e()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Configuration configuration, wu wuVar) {
        configuration.setLocales(LocaleList.forLanguageTags(wuVar.e()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wu w(Configuration configuration) {
        return wu.c(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public void e(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        ((lz) view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }

    public void f(Canvas canvas, RecyclerView recyclerView) {
    }

    public void g(Canvas canvas, RecyclerView recyclerView) {
    }
}
