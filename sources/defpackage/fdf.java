package defpackage;

import android.os.FileUtils;
import android.os.ParcelFileDescriptor;
import android.view.contentcapture.DataShareWriteAdapter;
import com.google.android.apps.inputmethod.libs.trainingcache.personalization.languagemodel.LanguageModelPersonalizationResultHandlingService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: fdf  reason: default package */
/* loaded from: classes.dex */
public final class fdf implements DataShareWriteAdapter {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fdf(File file, int i) {
        this.b = i;
        this.a = file;
    }

    public fdf(ngz ngzVar, int i) {
        this.b = i;
        this.a = ngzVar;
    }

    @Override // android.view.contentcapture.DataShareWriteAdapter
    public final void onError(int i) {
        if (this.b != 0) {
            ((ltd) ((ltd) LanguageModelPersonalizationResultHandlingService.a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService$1", "onError", 466, "LanguageModelPersonalizationResultHandlingService.java")).u("shareData request error: %s", i);
        } else {
            ((ltd) ((ltd) fdg.a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService$3", "onError", 198, "InputContextSharingService.java")).u("shareData request error: %s", i);
        }
    }

    @Override // android.view.contentcapture.DataShareWriteAdapter
    public final void onRejected() {
        if (this.b != 0) {
            ((ltd) ((ltd) LanguageModelPersonalizationResultHandlingService.a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService$1", "onRejected", 471, "LanguageModelPersonalizationResultHandlingService.java")).t("shareData request rejected");
        } else {
            ((ltd) ((ltd) fdg.a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService$3", "onRejected", 203, "InputContextSharingService.java")).t("shareData request rejected");
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [ngz, java.lang.Object] */
    @Override // android.view.contentcapture.DataShareWriteAdapter
    public final void onWrite(ParcelFileDescriptor parcelFileDescriptor) {
        if (this.b == 0) {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                this.a.p(autoCloseOutputStream);
                ((ltd) ((ltd) fdg.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService$3", "onWrite", 190, "InputContextSharingService.java")).w("shareData onWrite success: %s", fdg.b.getId());
                autoCloseOutputStream.close();
                return;
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) fdg.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/inputcontextsharing/InputContextSharingService$3", "onWrite", (char) 192, "InputContextSharingService.java")).t("shareData onWrite failed: IO error");
                return;
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream((File) this.a);
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            FileUtils.copy(fileInputStream, autoCloseOutputStream2);
            autoCloseOutputStream2.close();
            fileInputStream.close();
        } catch (IOException e2) {
            ((ltd) ((ltd) ((ltd) LanguageModelPersonalizationResultHandlingService.a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/trainingcache/personalization/languagemodel/LanguageModelPersonalizationResultHandlingService$1", "onWrite", (char) 460, "LanguageModelPersonalizationResultHandlingService.java")).t("Failed to copy from srcFile to destination.");
        }
    }
}
