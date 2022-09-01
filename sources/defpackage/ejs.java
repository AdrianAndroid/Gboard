package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: ejs  reason: default package */
/* loaded from: classes.dex */
public final class ejs implements mka {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/universalmedia/SearchStickerListener");
    private static final Comparator b = xr.l;
    private final ejt c;

    public ejs(ejt ejtVar) {
        this.c = ejtVar;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/search/universalmedia/SearchStickerListener", "onFailure", ')', "SearchStickerListener.java")).t("Failed to get results");
        if (th instanceof CancellationException) {
            return;
        }
        this.c.a(llp.q());
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (cww cwwVar : (List) obj) {
            arrayList.add(cwwVar.a());
        }
        this.c.a(llp.z(b, arrayList));
    }
}
