package defpackage;

import com.google.android.apps.inputmethod.libs.search.richsymbol.RichSymbolKeyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cjm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cjm implements lfe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cjm(cok cokVar, int i) {
        this.b = i;
        this.a = cokVar;
    }

    public /* synthetic */ cjm(dan danVar, int i) {
        this.b = i;
        this.a = danVar;
    }

    public /* synthetic */ cjm(dba dbaVar, int i) {
        this.b = i;
        this.a = dbaVar;
    }

    public /* synthetic */ cjm(dfy dfyVar, int i) {
        this.b = i;
        this.a = dfyVar;
    }

    public /* synthetic */ cjm(dpe dpeVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = dpeVar;
    }

    public /* synthetic */ cjm(hfd hfdVar, int i) {
        this.b = i;
        this.a = hfdVar;
    }

    public /* synthetic */ cjm(File file, int i) {
        this.b = i;
        this.a = file;
    }

    public /* synthetic */ cjm(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    public /* synthetic */ cjm(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ cjm(List list, int i) {
        this.b = i;
        this.a = list;
    }

    public /* synthetic */ cjm(Set set, int i) {
        this.b = i;
        this.a = set;
    }

    public /* synthetic */ cjm(llp llpVar, int i) {
        this.b = i;
        this.a = llpVar;
    }

    public /* synthetic */ cjm(lmz lmzVar, int i) {
        this.b = i;
        this.a = lmzVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        File u;
        switch (this.b) {
            case 0:
                return Objects.equals(((hfd) this.a).c, ((SoftKeyView) obj).b);
            case 1:
                return jbc.g(jbc.e(((cqp) obj).d()), this.a);
            case 2:
                Object obj2 = this.a;
                ltg ltgVar = clg.a;
                File u2 = ((cqp) obj).u();
                if (u2 != null) {
                    try {
                        if (u2.getCanonicalPath().startsWith(((File) obj2).getCanonicalPath())) {
                            return true;
                        }
                    } catch (IOException e) {
                        ((ltd) ((ltd) ((ltd) clg.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "isFileDescendantOf", (char) 557, "ContentDownloadTask.java")).t("Failed to find canonical path");
                    }
                }
                return false;
            case 3:
                Object obj3 = this.a;
                ltg ltgVar2 = clg.a;
                return ((lmz) obj3).contains(((Map.Entry) obj).getKey());
            case 4:
                ?? r0 = this.a;
                ltg ltgVar3 = clj.a;
                return !r0.contains(((cqp) obj).d().toString());
            case 5:
                ?? r02 = this.a;
                CharSequence charSequence = ((hln) obj).a;
                return charSequence != null && !r02.contains(charSequence.toString().trim());
            case 6:
                Object obj4 = this.a;
                File file = (File) obj;
                ltg ltgVar4 = cri.a;
                try {
                } catch (IOException e2) {
                    ((ltd) ((ltd) ((ltd) cri.a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "lambda$deleteFileIfNotDescendant$1", 481, "RecentImages.java")).w("Failed to find canonical path for file %s", ((File) obj4).getAbsolutePath());
                }
                return !((File) obj4).getCanonicalPath().startsWith(file.getCanonicalPath());
            case 7:
                return ((Class) this.a).isInstance(obj);
            case 8:
                return ((dpe) this.a).i((cxc) obj);
            case 9:
                Object obj5 = this.a;
                hhl hhlVar = cws.a;
                return !((lmz) obj5).contains((String) obj);
            case 10:
                Object obj6 = this.a;
                cxe cxeVar = cxe.a;
                return !((lmz) obj6).contains((cxc) obj);
            case 11:
                Object obj7 = this.a;
                int i = cxp.d;
                return ((cxk) obj).b.equals(obj7);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj8 = this.a;
                int i2 = cxp.d;
                return ((cxk) obj).b.equals(obj8);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj9 = this.a;
                hhl hhlVar2 = das.a;
                dan danVar = ((dal) obj).b;
                if (danVar == null) {
                    danVar = dan.c;
                }
                return danVar.equals(obj9);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((Class) this.a).isInstance(obj);
            case 15:
                Object obj10 = this.a;
                dxs dxsVar = (dxs) obj;
                Object obj11 = dxsVar.a;
                Object obj12 = dxsVar.b;
                HashSet<String> hashSet = new HashSet();
                ((dfy) obj10).h.a((dhu) obj12, hashSet, new HashSet());
                Set h = ((byy) obj11).h();
                for (String str : hashSet) {
                    if (!h.contains(str)) {
                        return false;
                    }
                }
                return true;
            case 16:
                ?? r03 = this.a;
                cqp cqpVar = (cqp) obj;
                Iterator it = r03.iterator();
                while (true) {
                    if (it.hasNext()) {
                        u = (File) cqpVar.k().get((String) it.next());
                        if (u != null) {
                        }
                    } else {
                        u = r03.contains("image/*") ? cqpVar.u() : null;
                    }
                }
                if (u != null) {
                    return true;
                }
                String e3 = jbc.e(cqpVar.d());
                if (e3.isEmpty()) {
                    ((ltd) ((ltd) dzi.a.d()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentFetcher", "lambda$filterImagesOfUnsuitableMimeType$4", 176, "ContentFetcher.java")).w("Unable to determine MIME type for %s", cqpVar.d());
                    return true;
                }
                return jbc.g(e3, r03);
            case 17:
                return ((cnz) obj).a.equals(((cok) this.a).b);
            case 18:
                Object obj13 = this.a;
                ltg ltgVar5 = RichSymbolKeyboard.a;
                return ((String) ((lct) obj).d).equals(obj13);
            case 19:
                return !((lmz) this.a).contains((cxc) obj);
            default:
                Object obj14 = this.a;
                ltg ltgVar6 = eie.a;
                return ((cxc) obj).b.equals(((dba) obj14).b);
        }
    }
}
