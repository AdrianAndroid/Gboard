package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.inputmethod.libs.search.sticker.StickerFavoritePacksReorderActivity;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ehz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ehz implements hiu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehz(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public /* synthetic */ ehz(avi aviVar, int i) {
        this.b = i;
        this.a = aviVar;
    }

    public /* synthetic */ ehz(StickerFavoritePacksReorderActivity stickerFavoritePacksReorderActivity, int i) {
        this.b = i;
        this.a = stickerFavoritePacksReorderActivity;
    }

    public /* synthetic */ ehz(EmojiView emojiView, int i) {
        this.b = i;
        this.a = emojiView;
    }

    public /* synthetic */ ehz(egj egjVar, int i) {
        this.b = i;
        this.a = egjVar;
    }

    public /* synthetic */ ehz(eie eieVar, int i) {
        this.b = i;
        this.a = eieVar;
    }

    public /* synthetic */ ehz(ejp ejpVar, int i) {
        this.b = i;
        this.a = ejpVar;
    }

    public /* synthetic */ ehz(enn ennVar, int i) {
        this.b = i;
        this.a = ennVar;
    }

    public /* synthetic */ ehz(eoo eooVar, int i) {
        this.b = i;
        this.a = eooVar;
    }

    public /* synthetic */ ehz(fbf fbfVar, int i) {
        this.b = i;
        this.a = fbfVar;
    }

    public /* synthetic */ ehz(hce hceVar, int i) {
        this.b = i;
        this.a = hceVar;
    }

    public /* synthetic */ ehz(hci hciVar, int i) {
        this.b = i;
        this.a = hciVar;
    }

    public /* synthetic */ ehz(hiw hiwVar, int i) {
        this.b = i;
        this.a = hiwVar;
    }

    public /* synthetic */ ehz(ibz ibzVar, int i) {
        this.b = i;
        this.a = ibzVar;
    }

    public /* synthetic */ ehz(ivr ivrVar, int i) {
        this.b = i;
        this.a = ivrVar;
    }

    public /* synthetic */ ehz(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [avi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.hiu
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((StickerFavoritePacksReorderActivity) this.a).k.L((llp) obj);
                return;
            case 1:
                Object obj2 = this.a;
                llp llpVar = (llp) obj;
                if (llpVar.isEmpty()) {
                    return;
                }
                egj egjVar = (egj) obj2;
                egjVar.d.e(ctf.BITMOJI_CONTEXTUAL_PACKS, csx.CONTEXTUAL_BITMOJI_CATEGORY_SUGGESTED);
                int size = llpVar.size();
                for (int i = 0; i < size; i++) {
                    if (((cxc) llpVar.get(i)).g.size() < ((Long) cwz.e.c()).intValue()) {
                        egjVar.d.e(ctf.BITMOJI_CONTEXTUAL_PACKS, csx.CONTEXTUAL_BITMOJI_CATEGORY_DROPPED_FEW_RESULTS);
                    }
                }
                return;
            case 2:
                cxe cxeVar = (cxe) obj;
                eie eieVar = (eie) this.a;
                dba dbaVar = eieVar.i;
                int i2 = -1;
                if (dbaVar != null) {
                    int X = lre.X(cxeVar.e, new cjm(dbaVar, 20));
                    if (X != -1) {
                        i2 = X + 3;
                    } else {
                        ((ltd) ((ltd) eie.a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/StickerRevampKeyboardPeer", "lambda$fetchPacksData$4", 263, "StickerRevampKeyboardPeer.java")).w("Can't open to opened sticker pack id %s.", dbaVar.b);
                    }
                }
                eieVar.g.m(cxeVar, i2);
                if (!cxeVar.g.e() || !eieVar.h.e((cxc) cxeVar.g.a())) {
                    return;
                }
                eieVar.f.b(((cxc) cxeVar.g.a()).b).v(new dvb(eieVar, cxeVar, 2), mjl.a);
                return;
            case 3:
                Throwable th = (Throwable) obj;
                eie eieVar2 = (eie) this.a;
                eieVar2.g.k(eie.a(new ega(eieVar2, 13)));
                return;
            case 4:
                ((ejp) this.a).c.a(ejp.b((llp) obj, ejp.b));
                return;
            case 5:
                Object obj3 = this.a;
                ((ltd) ((ltd) ((ltd) ejp.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/universalmedia/RecentEmojiFetcher", "lambda$fetch$1", '0', "RecentEmojiFetcher.java")).t("Failed to fetch recent emojis");
                ((ejp) obj3).c.a(ejp.b(llp.q(), ejp.b));
                return;
            case 6:
                Object obj4 = this.a;
                int intValue = ((Integer) obj).intValue();
                if (intValue != 5 && intValue != 10 && intValue != 15 && intValue != 60 && intValue != 80) {
                    return;
                }
                try {
                    ((enn) obj4).f.acquire();
                    ((enn) obj4).a();
                    ((enn) obj4).f.release();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 7:
                hkz hkzVar = (hkz) obj;
                eot.b(((eoo) this.a).b);
                return;
            case 8:
                Object obj5 = this.a;
                hkz hkzVar2 = (hkz) obj;
                ((ltd) ((ltd) fbf.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager", "lambda$createBasicTooltipBuilder$2", 274, "VoiceDonationPromoManager.java")).t("voice donation banner dismissed");
                fbf fbfVar = (fbf) obj5;
                if (fbfVar.i) {
                    fbfVar.h.a();
                    fbfVar.i = false;
                }
                fbfVar.c();
                return;
            case 9:
                llp llpVar2 = (llp) obj;
                hbw hbwVar = ((hci) this.a).s;
                if (hbwVar == null) {
                    return;
                }
                hbwVar.B(llpVar2);
                return;
            case 10:
                llp llpVar3 = (llp) obj;
                hbw hbwVar2 = ((hce) this.a).a.s;
                if (hbwVar2 == null) {
                    return;
                }
                hbwVar2.C(llpVar3);
                return;
            case 11:
                ((EmojiView) this.a).c((heg) obj);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Void r10 = (Void) obj;
                ((hiw) this.a).a.run();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ?? r0 = this.a;
                Throwable th2 = (Throwable) obj;
                int i3 = hjm.c;
                if (th2 instanceof Exception) {
                    r0.e((Exception) th2);
                    return;
                } else {
                    r0.e(new RuntimeException(th2));
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hkz hkzVar3 = (hkz) obj;
                this.a.run();
                return;
            case 15:
                ((hwu) obj).d((View) this.a);
                return;
            case 16:
                ((hwu) obj).f((ibz) this.a);
                return;
            default:
                Object obj6 = this.a;
                final jho jhoVar = (jho) obj;
                if (jhoVar == null) {
                    ((ltd) ((ltd) ivr.a.d()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "lambda$initDownloader$5", 228, "LocalComputationTaskManager.java")).t("Client file group is null.");
                    return;
                }
                final ivr ivrVar = (ivr) obj6;
                ivrVar.f.execute(new Runnable() { // from class: ivp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ivr ivrVar2 = ivr.this;
                        jho jhoVar2 = jhoVar;
                        llw d = ivr.d((mxd) ivr.b.j());
                        for (jhn jhnVar : jhoVar2.g) {
                            ndy ndyVar = jhnVar.f;
                            if (ndyVar == null) {
                                ndyVar = ndy.c;
                            }
                            if (ndyVar.a.equals("type.googleapis.com/keyboard.nebulae.LocalComputationArtifacts")) {
                                try {
                                    ndy ndyVar2 = jhnVar.f;
                                    if (ndyVar2 == null) {
                                        ndyVar2 = ndy.c;
                                    }
                                    nem nemVar = ndyVar2.b;
                                    nfb b = nfb.b();
                                    mxb mxbVar = mxb.d;
                                    ner l = nemVar.l();
                                    nfm nfmVar = (nfm) mxbVar.N(4);
                                    try {
                                        try {
                                            try {
                                                nho b2 = nhh.a.b(nfmVar);
                                                b2.h(nfmVar, nes.p(l), b);
                                                b2.f(nfmVar);
                                                try {
                                                    l.z(0);
                                                    nfm.O(nfmVar);
                                                    mxb mxbVar2 = (mxb) nfmVar;
                                                    mxc mxcVar = (mxc) d.get(jhnVar.b);
                                                    if (mxcVar == null) {
                                                        ((ltd) ((ltd) ivr.a.d()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "handleDownloadedClientFile", 262, "LocalComputationTaskManager.java")).w("Attached config %s removed in latest config list.", jhnVar.b);
                                                    } else {
                                                        String str = mxbVar2.b;
                                                        mxb mxbVar3 = mxcVar.d;
                                                        if (mxbVar3 == null) {
                                                            mxbVar3 = mxb.d;
                                                        }
                                                        if (!str.equals(mxbVar3.b)) {
                                                            ((ltd) ((ltd) ivr.a.d()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "handleDownloadedClientFile", 267, "LocalComputationTaskManager.java")).w("The checksum of client file mismatched with latest config %s.", mxcVar.b);
                                                        } else if (ivrVar2.j(mxcVar)) {
                                                            continue;
                                                        } else {
                                                            File e = ivrVar2.d.e(jhnVar);
                                                            if (e != null) {
                                                                ltg ltgVar = jan.a;
                                                                Context context = ivrVar2.c;
                                                                String str2 = mxcVar.b;
                                                                mxb mxbVar4 = mxcVar.d;
                                                                if (mxbVar4 == null) {
                                                                    mxbVar4 = mxb.d;
                                                                }
                                                                File k = ker.k(context, Uri.parse(mhr.a("appfiles:/nebulae/lc", str2, mxbVar4.b)));
                                                                try {
                                                                    ovv ovvVar = new ovv(new oyp(new FileInputStream(e)));
                                                                    while (true) {
                                                                        ovw e2 = ovvVar.e();
                                                                        if (e2 == null) {
                                                                            break;
                                                                        } else if (!e2.b()) {
                                                                            File file = new File(k, e2.a);
                                                                            File parentFile = file.getParentFile();
                                                                            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                                                                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                                                try {
                                                                                    byte[] bArr = new byte[8024];
                                                                                    while (true) {
                                                                                        int read = ovvVar.read(bArr);
                                                                                        if (read == -1) {
                                                                                            break;
                                                                                        }
                                                                                        fileOutputStream.write(bArr, 0, read);
                                                                                    }
                                                                                    fileOutputStream.close();
                                                                                } finally {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                ((ltd) ((ltd) jan.a.c()).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "unTarXz", 100, "FileOperationUtils.java")).w("Failed to create directory %s", parentFile.getAbsolutePath());
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    ovvVar.close();
                                                                } catch (IOException e3) {
                                                                    ((ltd) ((ltd) ((ltd) jan.a.c()).i(e3)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "unTarXz", 'n', "FileOperationUtils.java")).t("Failed to decompress tar xz file.");
                                                                }
                                                                Context context2 = ivrVar2.c;
                                                                String str3 = mxcVar.b;
                                                                mxb mxbVar5 = mxcVar.d;
                                                                if (mxbVar5 == null) {
                                                                    mxbVar5 = mxb.d;
                                                                }
                                                                ker.k(context2, kki.H(str3, mxbVar5.b)).mkdirs();
                                                                ivrVar2.g.e(iwc.LC_ARTIFACTS_EXTRACTED, mxcVar.b);
                                                            } else {
                                                                ((ltd) ((ltd) ivr.a.c()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "handleDownloadedClientFile", 284, "LocalComputationTaskManager.java")).w("Client file with id %s not found.", jhnVar.b);
                                                            }
                                                            if (ivrVar2.j(mxcVar)) {
                                                                ivrVar2.h(mxcVar);
                                                                ivrVar2.i(mxcVar);
                                                                ivrVar2.g(mxcVar);
                                                            } else {
                                                                ((ltd) ((ltd) ivr.a.c()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "handleDownloadedClientFile", 292, "LocalComputationTaskManager.java")).w("Local computation artifacts for %s still missing after initialization.", mxcVar.b);
                                                            }
                                                            mxb mxbVar6 = mxcVar.d;
                                                            if (mxbVar6 == null) {
                                                                mxbVar6 = mxb.d;
                                                            }
                                                            String str4 = mxbVar6.b;
                                                        }
                                                    }
                                                } catch (ngd e4) {
                                                    throw e4;
                                                }
                                            } catch (ngd e5) {
                                                if (e5.a) {
                                                    throw new ngd(e5);
                                                }
                                                throw e5;
                                            }
                                        } catch (IOException e6) {
                                            if (e6.getCause() instanceof ngd) {
                                                throw ((ngd) e6.getCause());
                                            }
                                            throw new ngd(e6);
                                        }
                                    } catch (nhz e7) {
                                        throw e7.a();
                                    } catch (RuntimeException e8) {
                                        if (e8.getCause() instanceof ngd) {
                                            throw ((ngd) e8.getCause());
                                        }
                                        throw e8;
                                    }
                                } catch (ngd e9) {
                                    ((ltd) ((ltd) ((ltd) ivr.a.c()).i(e9)).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "handleDownloadedClientFile", (char) 257, "LocalComputationTaskManager.java")).t("Failed to parse custom metadata to config.");
                                }
                            } else {
                                ltd ltdVar = (ltd) ((ltd) ivr.a.c()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "handleDownloadedClientFile", 246, "LocalComputationTaskManager.java");
                                ndy ndyVar3 = jhnVar.f;
                                if (ndyVar3 == null) {
                                    ndyVar3 = ndy.c;
                                }
                                ltdVar.w("Unexpected custom metadata type url: %s", ndyVar3.a);
                            }
                        }
                    }
                });
                return;
        }
    }
}
