package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* renamed from: eii  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eii implements hiu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eii(SparseArray sparseArray, hiu hiuVar, int i) {
        this.c = i;
        this.a = sparseArray;
        this.b = hiuVar;
    }

    public /* synthetic */ eii(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, llk llkVar, int i) {
        this.c = i;
        this.a = universalMediaKeyboardTablet;
        this.b = llkVar;
    }

    public /* synthetic */ eii(eij eijVar, hja hjaVar, int i) {
        this.c = i;
        this.a = eijVar;
        this.b = hjaVar;
    }

    public /* synthetic */ eii(eij eijVar, String str, int i) {
        this.c = i;
        this.a = eijVar;
        this.b = str;
    }

    public /* synthetic */ eii(eov eovVar, ewj ewjVar, int i, byte[] bArr) {
        this.c = i;
        this.b = eovVar;
        this.a = ewjVar;
    }

    public /* synthetic */ eii(hat hatVar, hax haxVar, int i) {
        this.c = i;
        this.a = hatVar;
        this.b = haxVar;
    }

    public /* synthetic */ eii(hbs hbsVar, llp llpVar, int i) {
        this.c = i;
        this.a = hbsVar;
        this.b = llpVar;
    }

    public /* synthetic */ eii(hci hciVar, hdg hdgVar, int i) {
        this.c = i;
        this.a = hciVar;
        this.b = hdgVar;
    }

    public /* synthetic */ eii(hjm hjmVar, avi aviVar, int i) {
        this.c = i;
        this.b = hjmVar;
        this.a = aviVar;
    }

    public /* synthetic */ eii(hoo hooVar, Runnable runnable, int i) {
        this.c = i;
        this.a = hooVar;
        this.b = runnable;
    }

    public /* synthetic */ eii(hxi hxiVar, Integer num, int i) {
        this.c = i;
        this.a = hxiVar;
        this.b = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, hja] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, hdg] */
    /* JADX WARN: Type inference failed for: r1v30, types: [avi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [hiu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, imn] */
    @Override // defpackage.hiu
    public final void a(Object obj) {
        cng a;
        cuj a2;
        bue bueVar = null;
        switch (this.c) {
            case 0:
                Object obj2 = this.a;
                ?? r1 = this.b;
                eis eisVar = ((eij) obj2).f;
                eisVar.h.a = r1;
                eisVar.m = cni.a;
                eisVar.o = (llp) obj;
                eisVar.n(eir.SEARCH);
                return;
            case 1:
                Throwable th = (Throwable) obj;
                eij eijVar = (eij) this.a;
                eijVar.f.o(eij.a(new dvc(eijVar, (String) this.b, 19)));
                return;
            case 2:
                Object obj3 = this.a;
                Object obj4 = this.b;
                eij eijVar2 = (eij) obj3;
                eis eisVar2 = eijVar2.f;
                if (((Throwable) obj) instanceof IllegalStateException) {
                    Context context = eijVar2.b;
                    hsz hszVar = eijVar2.c;
                    cnf a3 = cng.a();
                    a3.c(false);
                    a3.e(1);
                    a3.h(R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a);
                    a3.g(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c);
                    a3.d(R.string.f167220_resource_name_obfuscated_res_0x7f140932);
                    a3.f(R.string.f167210_resource_name_obfuscated_res_0x7f140931);
                    if (cuz.a.k(context) && !hszVar.X()) {
                        bueVar = new bue(context, hszVar, (String) obj4, 20);
                    }
                    a3.a = bueVar;
                    a = a3.a();
                } else {
                    a = eij.a(new dvc(eijVar2, (String) obj4, 18));
                }
                eisVar2.o(a);
                return;
            case 3:
                Object obj5 = this.a;
                Object obj6 = this.b;
                llp llpVar = (llp) obj;
                int size = llpVar.size();
                for (int i = 0; i < size; i++) {
                    String str = ((cnz) llpVar.get(i)).a;
                    str.getClass();
                    ((llk) obj6).h(new ejk(str));
                }
                UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) obj5;
                BindingRecyclerView bindingRecyclerView = universalMediaKeyboardTablet.m;
                if (bindingRecyclerView == null || (a2 = bindingRecyclerView.a()) == null) {
                    return;
                }
                a2.G(((llk) obj6).g());
                int i2 = universalMediaKeyboardTablet.n;
                if (i2 <= 0) {
                    return;
                }
                a2.D(i2, true);
                return;
            case 4:
                Object obj7 = this.b;
                hkz hkzVar = (hkz) obj;
                ewj ewjVar = (ewj) this.a;
                for (View view : ewjVar.b) {
                    ewjVar.a.c(view, null, true);
                }
                ewjVar.b.clear();
                eov eovVar = (eov) obj7;
                eovVar.d.g(eou.a, System.currentTimeMillis() - eovVar.e);
                return;
            case 5:
                Object obj8 = this.a;
                Object obj9 = this.b;
                Void r10 = (Void) obj;
                hav havVar = ((hat) obj8).d;
                llw k = llw.k(Collections.unmodifiableMap(((hax) obj9).a));
                if (!((Boolean) hav.d.c()).booleanValue()) {
                    return;
                }
                HashSet hashSet = new HashSet();
                lsz it = k.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    hashSet.add(hav.b.h(entry.getKey(), entry.getValue(), new Object[0]));
                }
                havVar.e.k("emoji_variant_prefs", hashSet);
                if (k.isEmpty()) {
                    return;
                }
                ieh.j().e(hay.a, 0);
                return;
            case 6:
                Void r102 = (Void) obj;
                ((hbs) this.a).g.x((llp) this.b);
                return;
            case 7:
                Object obj10 = this.a;
                Object obj11 = this.b;
                Throwable th2 = (Throwable) obj;
                ((ltd) ((ltd) hbs.a.b()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController", "lambda$setEmojiList$1", 211, "EmojiListController.java")).t("Emoji variant loading failed.");
                ((hbs) obj10).g.x((llp) obj11);
                return;
            case 8:
                Object obj12 = this.a;
                ?? r12 = this.b;
                llp llpVar2 = (llp) obj;
                ((ltd) ((ltd) hci.a.b()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "lambda$requestAndUpdatePageableItems$9", 875, "EmojiPickerController.java")).u("Emoji picker pageable data loaded %d items.", llpVar2.size());
                hci hciVar = (hci) obj12;
                hbw b = hciVar.b();
                hciVar.w++;
                llp l = hciVar.l(r12, llpVar2);
                int d = b.g.d();
                if (d >= 0) {
                    hdb hdbVar = b.g;
                    if (hdbVar.e) {
                        hdbVar.b.set(hdbVar.d(), l);
                        hdbVar.f();
                    }
                    b.j(b.z(d), b.y(d));
                }
                hciVar.t.set(false);
                return;
            case 9:
                Object obj13 = this.b;
                ?? r13 = this.a;
                iij iijVar = (iij) obj;
                if (!iin.j(iijVar)) {
                    Exception exc = iijVar.d;
                    if (exc == null) {
                        exc = new IOException(String.format(Locale.US, "Request failed with response code %d", Integer.valueOf(iijVar.b)));
                    }
                    r13.e(exc);
                    return;
                }
                r13.b(((hjm) obj13).b.a(iijVar.e.n()));
                return;
            case 10:
                Object obj14 = this.a;
                ?? r2 = this.b;
                hkz hkzVar2 = (hkz) obj;
                if (r2 != 0) {
                    r2.run();
                }
                hoo hooVar = (hoo) obj14;
                hooVar.d = null;
                hooVar.c = null;
                return;
            case 11:
                Object obj15 = this.a;
                Object obj16 = this.b;
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((hxi) obj15).c.get((hxh) obj);
                if (copyOnWriteArraySet == null) {
                    return;
                }
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    hwt hwtVar = (hwt) it2.next();
                    if (copyOnWriteArraySet.contains(hwtVar)) {
                        ((Integer) obj16).intValue();
                        hwtVar.a();
                    }
                }
                return;
            default:
                Object obj17 = this.a;
                ?? r14 = this.b;
                View view2 = (View) obj;
                if (((SparseArray) obj17).get(view2.getId()) == null) {
                    return;
                }
                r14.a(view2);
                return;
        }
    }
}
