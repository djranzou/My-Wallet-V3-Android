package piuk.blockchain.android.data.services;

import info.blockchain.wallet.api.WalletApi;

import io.reactivex.Completable;

public class NotificationService {

    private WalletApi walletApi;

    public NotificationService(WalletApi walletApi) {
        this.walletApi = walletApi;
    }

    /**
     * Sends the updated Firebase token to the server along with the GUID and Shared Key
     *
     * @param token     A Firebase notification token
     * @param guid      The user's GUID
     * @param sharedKey The user's shared key
     * @return A {@link Completable}, ie an Observable type object specifically for methods
     * returning void.
     */
    public Completable sendNotificationToken(String token, String guid, String sharedKey) {
        return Completable.fromObservable(walletApi.updateFirebaseNotificationToken(token, guid, sharedKey));
    }
}
