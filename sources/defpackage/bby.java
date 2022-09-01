package defpackage;

/* compiled from: PG */
/* renamed from: bby  reason: default package */
/* loaded from: classes.dex */
final class bby extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public bby() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
