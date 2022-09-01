package defpackage;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzy  reason: default package */
/* loaded from: classes.dex */
public final class dzy extends hqi {
    final /* synthetic */ dzz a;
    private final AtomicReference b = new AtomicReference(null);

    public dzy(dzz dzzVar) {
        this.a = dzzVar;
    }

    @Override // defpackage.hqi
    protected final void a(hpy hpyVar) {
        hpy hpyVar2 = (hpy) this.b.get();
        if (hpyVar2 != null && !hpyVar.g() && !hpyVar.f()) {
            String obj = hpyVar2.d().toString();
            String obj2 = hpyVar.d().toString();
            if (obj2.startsWith(obj) && !obj2.equals(obj)) {
                dzz dzzVar = this.a;
                String obj3 = hpyVar.d().toString();
                ArrayList arrayList = new ArrayList();
                lmz a = hdq.b().a();
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(obj3);
                int last = characterInstance.last();
                int previous = characterInstance.previous();
                while (true) {
                    int i = previous;
                    int i2 = last;
                    last = i;
                    if (last == -1 || arrayList.size() >= 2) {
                        break;
                    }
                    String substring = obj3.substring(last, i2);
                    if (!a.contains(substring)) {
                        break;
                    }
                    arrayList.add(((hbd) dzzVar.b.a()).g().b(substring));
                    previous = characterInstance.previous();
                }
                llp o = llp.o(arrayList);
                if (o.size() > 2) {
                    ((ltd) ((ltd) dzz.a.c()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionQueriesDispatcher$InputContextListener", "onAppInputContextChangedInternal", 108, "ContentSuggestionQueriesDispatcher.java")).t("Unexpectedly extracted more than 2 emojis from text before cursor");
                } else {
                    dat a2 = dat.a(o);
                    if (!a2.equals(dat.a)) {
                        this.a.c.execute(new dvd(a2, 18));
                    }
                }
            }
        }
        this.b.set(hpyVar);
    }

    @Override // defpackage.hqi
    protected final void c() {
        this.b.set(null);
    }

    public final void d(hpy hpyVar) {
        this.b.set(hpyVar);
    }
}
