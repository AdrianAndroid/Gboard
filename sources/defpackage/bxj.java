package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bxj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bxj implements hiu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bxj(bxm bxmVar, int i) {
        this.b = i;
        this.a = bxmVar;
    }

    public /* synthetic */ bxj(cfz cfzVar, int i) {
        this.b = i;
        this.a = cfzVar;
    }

    public /* synthetic */ bxj(cik cikVar, int i) {
        this.b = i;
        this.a = cikVar;
    }

    public /* synthetic */ bxj(cjt cjtVar, int i) {
        this.b = i;
        this.a = cjtVar;
    }

    public /* synthetic */ bxj(clb clbVar, int i) {
        this.b = i;
        this.a = clbVar;
    }

    public /* synthetic */ bxj(Delight5Facilitator delight5Facilitator, int i) {
        this.b = i;
        this.a = delight5Facilitator;
    }

    public /* synthetic */ bxj(cqf cqfVar, int i) {
        this.b = i;
        this.a = cqfVar;
    }

    public /* synthetic */ bxj(csu csuVar, int i) {
        this.b = i;
        this.a = csuVar;
    }

    public /* synthetic */ bxj(cuc cucVar, int i) {
        this.b = i;
        this.a = cucVar;
    }

    public /* synthetic */ bxj(cuo cuoVar, int i) {
        this.b = i;
        this.a = cuoVar;
    }

    public /* synthetic */ bxj(cvx cvxVar, int i) {
        this.b = i;
        this.a = cvxVar;
    }

    public /* synthetic */ bxj(div divVar, int i) {
        this.b = i;
        this.a = divVar;
    }

    public /* synthetic */ bxj(dlr dlrVar, int i) {
        this.b = i;
        this.a = dlrVar;
    }

    public /* synthetic */ bxj(ConcurrentHashMap concurrentHashMap, int i) {
        this.b = i;
        this.a = concurrentHashMap;
    }

    public /* synthetic */ bxj(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ bxj(knk knkVar, int i) {
        this.b = i;
        this.a = knkVar;
    }

    public /* synthetic */ bxj(ovg ovgVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ovgVar;
    }

    /* JADX WARN: Type inference failed for: r0v97, types: [knk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [bwu, java.lang.Object] */
    @Override // defpackage.hiu
    public final void a(Object obj) {
        ls lsVar;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                ((bxm) obj2).g.e();
                return;
            case 1:
                hkz hkzVar = (hkz) obj;
                ovg ovgVar = (ovg) this.a;
                if (!ovgVar.b) {
                    ovgVar.e.F((SparseArray) ovgVar.d);
                }
                ovgVar.a = false;
                return;
            case 2:
                Object obj3 = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                ((Delight5Facilitator) obj3).z();
                return;
            case 3:
                Object obj4 = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                ((Delight5Facilitator) obj4).m.g.d();
                return;
            case 4:
                ((ConcurrentHashMap) this.a).putAll((Map) obj);
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) Delight5Facilitator.a.c()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/delight5/Delight5Facilitator", "lambda$logResult$2", 479, "Delight5Facilitator.java")).w("Exception from %s", this.a);
                return;
            case 6:
                hkz hkzVar2 = (hkz) obj;
                ((cfz) this.a).h = false;
                ((ltd) ((ltd) cfz.a.b()).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceExtension", "lambda$maybeShowAutofillOnboarding$11", 871, "DeviceIntelligenceExtension.java")).t("device intelligence onboarding dismissed");
                return;
            case 7:
                Object obj5 = this.a;
                Integer num = (Integer) obj;
                if (num.intValue() == 15 || num.intValue() == 80) {
                    ((cik) obj5).d.d();
                    return;
                } else if (num.intValue() == 20) {
                    return;
                } else {
                    daz dazVar = ((cik) obj5).d;
                    dazVar.a.trimToSize(dazVar.b() / 2);
                    return;
                }
            case 8:
                hkz hkzVar3 = (hkz) obj;
                cjt cjtVar = (cjt) this.a;
                gqj.d.g(cjtVar.n);
                cjtVar.c();
                cjtVar.f();
                return;
            case 9:
                Object obj6 = this.a;
                byy byyVar = (byy) obj;
                if (byyVar == null) {
                    return;
                }
                clb clbVar = (clb) obj6;
                byy byyVar2 = (byy) clbVar.d.getAndSet(byyVar);
                if (byyVar.equals(byyVar2)) {
                    return;
                }
                for (opu opuVar : clbVar.e) {
                    ckq ckqVar = (ckq) opuVar.a;
                    lfb e = ckqVar.g.e();
                    if (!e.e()) {
                        ((ltd) ((ltd) ckq.a.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheModule", "updateKeywordSetAndMaybeScheduleContentDownload", 290, "ContentCacheModule.java")).t("Failed to obtain metadata file");
                    } else {
                        clm a = clm.a((cla) e.a());
                        boe boeVar = ckqVar.j;
                        if (boeVar != null) {
                            boeVar.n(a.b);
                        }
                        int i = ((cla) e.a()).b;
                        Context context = ckqVar.c;
                        try {
                            FileInputStream fileInputStream = new FileInputStream(clk.b(context));
                            try {
                                cku ckuVar = (cku) nfm.x(cku.d, fileInputStream, nfb.b());
                                if (a.a.isEmpty() || ckuVar.c == i) {
                                    Set keySet = Collections.unmodifiableMap(ckuVar.b).keySet();
                                    if (!keySet.containsAll(a.a)) {
                                        cln.c(context, lmz.p(lvw.i(a.a, keySet)));
                                    } else if (a.b.containsAll(keySet) && cln.a(context).isEmpty()) {
                                        ((ltd) ((ltd) ckq.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheModule", "maybePrepareContentDownload", 149, "ContentCacheModule.java")).t("Cached content is up-to-date");
                                        fileInputStream.close();
                                    }
                                } else {
                                    cln.c(context, a.a);
                                }
                                fileInputStream.close();
                            } finally {
                                try {
                                } catch (Throwable th) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                    } catch (Exception unused) {
                                    }
                                }
                                break;
                            }
                        } catch (FileNotFoundException unused2) {
                            cln.c(context, a.a);
                            clg.f(ism.a(ckqVar.c));
                        } catch (IOException e2) {
                            ((ltd) ((ltd) ((ltd) ckq.a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheModule", "maybePrepareContentDownload", (char) 154, "ContentCacheModule.java")).t("Failed to load keyword --> cached images mapping from disk");
                            cln.c(context, a.a);
                            clg.f(ism.a(ckqVar.c));
                        }
                        clg.f(ism.a(ckqVar.c));
                    }
                }
                if (byyVar2 == null) {
                    return;
                }
                byyVar2.close();
                return;
            case 10:
                Object obj7 = this.a;
                ((ltd) ((ltd) ((ltd) cqf.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/expression/history/ExpressionDataPrunePeriodicTask", "lambda$onRunTask$1", 'l', "ExpressionDataPrunePeriodicTask.java")).t("Failed to prune expression shares history.");
                ((cqf) obj7).c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_FINISHED_FAILURE);
                return;
            case 11:
                Throwable th2 = (Throwable) obj;
                ((cqf) this.a).c.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_CANCELLED);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((csu) this.a).m(cog.f(obj));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj8 = this.a;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((csu) obj8).m(new csp(th3));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj9 = this.a;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((csu) obj9).m(new cso(th4));
                return;
            case 15:
                Object obj10 = this.a;
                byy byyVar3 = (byy) obj;
                if (byyVar3.i()) {
                    return;
                }
                byy byyVar4 = (byy) ((cuc) obj10).f.getAndSet(byyVar3);
                if (byyVar3.equals(byyVar4) || byyVar4 == null) {
                    return;
                }
                byyVar4.close();
                return;
            case 16:
                Iterable iterable = (Iterable) obj;
                RecyclerView recyclerView = ((cuo) this.a).b;
                if (recyclerView == null || !recyclerView.p || (lsVar = recyclerView.l) == null) {
                    return;
                }
                if (!(lsVar instanceof cuj)) {
                    throw new IllegalStateException("InfiniteScrollListener can only be used with a BindingAdapter");
                }
                ((cuj) lsVar).M(iterable);
                return;
            case 17:
                Object obj11 = this.a;
                if (((cvv) obj) == cvv.READY) {
                    return;
                }
                cvl.b(((cvx) obj11).b).d();
                return;
            case 18:
                Integer num2 = (Integer) obj;
                cwn.d(this.a);
                return;
            case 19:
                ((div) this.a).g((jho) obj);
                return;
            default:
                Object obj12 = this.a;
                byy byyVar5 = (byy) obj;
                if (byyVar5 == null || byyVar5.i()) {
                    return;
                }
                byy byyVar6 = (byy) ((dlr) obj12).f.getAndSet(byyVar5);
                if (byyVar5.equals(byyVar6)) {
                    return;
                }
                dlr.d = true;
                if (byyVar6 == null) {
                    return;
                }
                byyVar6.close();
                return;
        }
    }
}
