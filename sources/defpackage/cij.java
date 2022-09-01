package defpackage;

import android.text.Html;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* renamed from: cij  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cij implements hiv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cij(chs chsVar, int i) {
        this.b = i;
        this.a = chsVar;
    }

    public /* synthetic */ cij(czt cztVar, int i) {
        this.b = i;
        this.a = cztVar;
    }

    public /* synthetic */ cij(File file, int i) {
        this.b = i;
        this.a = file;
    }

    public /* synthetic */ cij(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.hiv
    public final Object a(Object obj) {
        czo a;
        int i = this.b;
        if (i == 0) {
            cvv cvvVar = (cvv) obj;
            FileInputStream fileInputStream = new FileInputStream((File) this.a);
            try {
                mwo mwoVar = (mwo) nfm.x(mwo.b, fileInputStream, nfb.b());
                fileInputStream.close();
                return mwoVar.a;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } else if (i == 1) {
            chn chnVar = (chn) obj;
            File file = new File(((chs) this.a).b, "expression_history_proto");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                chnVar.p(fileOutputStream);
                fileOutputStream.close();
                return file;
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        } else if (i == 2) {
            Object obj2 = this.a;
            iij iijVar = (iij) obj;
            if (!iin.j(iijVar) || iijVar.e.C()) {
                ((ltd) ((ltd) ((ltd) cuy.a.b()).i(iijVar.d)).k("com/google/android/apps/inputmethod/libs/expression/searchsuggest/SearchSuggestFetcher", "parseResponse", 95, "SearchSuggestFetcher.java")).w("No suggestions fetched from server for query [%s].", obj2);
                return llp.q();
            }
            JSONArray jSONArray = new JSONArray(new String(iijVar.e.D())).getJSONArray(1);
            llk e = llp.e();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                    int optInt = jSONArray2.optInt(1, -1);
                    if (optInt == -1) {
                        ((ltd) ((ltd) cuy.a.d()).k("com/google/android/apps/inputmethod/libs/expression/searchsuggest/SearchSuggestFetcher", "addSuggestionsFromJson", 131, "SearchSuggestFetcher.java")).t("Suggestion from server missing type. Defaulting to query type.");
                        optInt = 0;
                    }
                    if (optInt == 0) {
                        e.h(Html.fromHtml(jSONArray2.getString(0)).toString());
                    } else {
                        ((ltd) ((ltd) cuy.a.d()).k("com/google/android/apps/inputmethod/libs/expression/searchsuggest/SearchSuggestFetcher", "addSuggestionsFromJson", 140, "SearchSuggestFetcher.java")).u("Unknown suggestion type: %s", optInt);
                    }
                } catch (JSONException e2) {
                    throw e2;
                }
            }
            return e.g();
        } else {
            Object obj3 = this.a;
            byy byyVar = (byy) obj;
            if (byyVar == null) {
                throw new NullPointerException("No new PackSet available");
            }
            try {
                File c = czt.c("fonts", byyVar);
                File c2 = czt.c("animation", byyVar);
                File c3 = czt.c("metadata", byyVar);
                if (c == null || c2 == null) {
                    throw new NullPointerException("Cannot find fontsDir or animationDir");
                }
                String[] list = c2.list();
                llp p = list != null ? llp.p(list) : llp.q();
                if (c3 == null) {
                    czj czjVar = ((czt) obj3).e;
                    lls h = llw.h();
                    lmx g = lmz.g();
                    lna g2 = lnd.g();
                    lna g3 = lnd.g();
                    lta listIterator = p.listIterator();
                    while (listIterator.hasNext()) {
                        String str = (String) listIterator.next();
                        lfb b = czn.b(new File(c2.getAbsolutePath(), str));
                        if (b.e()) {
                            h.a(str, (czl) b.a());
                            if (((czl) b.a()).a) {
                                g.d(str);
                            }
                            czn.c(str, g2, ((czl) b.a()).b);
                            czn.c(str, g3, ((czl) b.a()).c);
                        }
                    }
                    emv b2 = czo.b();
                    b2.f = c2;
                    b2.c = c;
                    b2.d = h.l();
                    b2.f(g.g());
                    b2.e(g2.f());
                    b2.g(g3.f());
                    a = b2.c();
                    czjVar.c.set(a);
                } else {
                    czj czjVar2 = ((czt) obj3).e;
                    a = czn.a(new File(c3.getAbsolutePath(), "parsed_metadata.json"), c2, c);
                    czjVar2.c.set(a);
                }
                return a;
            } finally {
                byyVar.close();
            }
        }
    }
}
